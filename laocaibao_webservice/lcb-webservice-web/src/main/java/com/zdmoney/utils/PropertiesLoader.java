/**
 * Copyright (c) 2005-2011 springside.org.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 
 * $Id: PropertiesLoader.java 1690 2012-02-22 13:42:00Z calvinxiu $
 */
package com.zdmoney.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;


import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties文件载入工具类. 可载入多个properties文件, 相同的属性在最后载入的文件中的值将会覆盖之前的值.
 * 
 * @author calvin
 */
@Slf4j
public class PropertiesLoader {

	private static ResourceLoader resourceLoader = new DefaultResourceLoader();

	private PropertiesLoader() {
	}

	/**
	 * 载入多个文件, 文件路径使用Spring Resource格式.
	 */
	public static Properties loadProperties(String... resourcesPaths) throws IOException {
		Properties props = new Properties();

		for (String location : resourcesPaths) {

			log.debug("Loading properties file from:" + location);

			InputStream is = null;
			try {
				Resource resource = resourceLoader.getResource(location);
				is = resource.getInputStream();
				props.load(is);
			} catch (IOException ex) {
				log.info("Could not load properties from path:" + location + ", " + ex.getMessage());
			} finally {
				IOUtils.closeQuietly(is);
			}
		}
		return props;
	}
}

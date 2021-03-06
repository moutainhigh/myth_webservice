package com.zdmoney.webservice.api.dto.app;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BannerDTO implements Serializable {
	private Long id;
	private String url;
	private String imgName;
	private String title;
}

package com.zdmoney.webservice.api.facade;import com.zdmoney.webservice.api.common.dto.ResultDto;import com.zdmoney.webservice.api.dto.customer.CustomerVO;import com.zdmoney.webservice.api.dto.customer.InfoConfirmForWacaiDTO;import com.zdmoney.webservice.api.dto.customer.RegistDTO;import com.zdmoney.webservice.api.dto.customer.UserLoginDTO;import java.util.Map;/** * 用户相关服务 * * @Date: 2018.12.11 */public interface IUserFacadeService {    /**     * 手机号登录     * 400002     * @param userLoginDTO     * @return     */    ResultDto<CustomerVO> checkPwd(UserLoginDTO userLoginDTO);    /**     * 微信注册or登录     *     * @param registDTO     * @return     */    ResultDto<CustomerVO> wechatRegistOrLogin(RegistDTO registDTO);    /**     * 判断用户是否绑定微信     *     * @param openId     * @return     */    ResultDto<Map> checkWxBind(String openId) throws Exception;    /**     * 判断微信是否绑定app     *     * @param openId     * @return     * @throws Exception     */    ResultDto<Map> checkLoginOpenIdBind(String openId) throws Exception;    /**     * 获取挖财确认界面信息     * @return     * @throws Exception     */    ResultDto<InfoConfirmForWacaiDTO> getInfos(String borrowerNo)throws Exception;    /**     * 实名+认证     * @param param     * @return     * @throws Exception     */    ResultDto confirmInfos(Map param)throws Exception;}
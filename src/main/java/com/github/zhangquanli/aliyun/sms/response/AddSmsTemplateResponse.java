package com.github.zhangquanli.aliyun.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.aliyun.sms.http.AbstractResponse;

/**
 * AddSmsTemplateResponse
 *
 * @author zhangquanli
 */
public class AddSmsTemplateResponse extends AbstractResponse {

    /**
     * 描述：短信模板CODE。
     * 示例：SMS_152550005
     */
    @JsonProperty("TemplateCode")
    private String templateCode;

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}

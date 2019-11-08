package com.github.zhangquanli.aliyun.sms.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.aliyun.sms.http.AbstractRequest;

/**
 * ModifySmsTemplateRequest
 *
 * @author zhangquanli
 */
public class ModifySmsTemplateRequest extends AbstractRequest {

    /**
     * 示例：短信模板CODE。
     * 示例：SMS_152550005
     * 是否必填：是
     */
    @JsonProperty("TemplateCode")
    private String templateCode;
    /**
     * 描述：短信类型。其中：
     * 0：验证码。
     * 1：短信通知。
     * 2：推广短信。
     * 3：国际/港澳台消息。
     * 示例：1
     * 是否必填：是
     */
    @JsonProperty("TemplateType")
    private Integer templateType;
    /**
     * 描述：模板名称，长度为1~30个字符。
     * 示例：阿里云短信测试模板
     * 是否必填：是
     */
    @JsonProperty("TemplateName")
    private String templateName;
    /**
     * 描述：模板内容，长度为1~500个字符。
     * 示例：您正在申请手机注册，验证码为：${code}，5分钟内有效！
     * 是否必填：是
     */
    @JsonProperty("TemplateContent")
    private String templateContent;
    /**
     * 描述：短信模板申请说明。请在申请说明中描述您的业务使用场景，长度为1~100个字符。
     * 示例：当前的短信模板应用于双11大促推广营销
     * 是否必填：是
     */
    @JsonProperty("Remark")
    private String remark;

    private ModifySmsTemplateRequest(String templateCode, Integer templateType, String templateName, String templateContent, String remark) {
        this.templateCode = templateCode;
        this.templateType = templateType;
        this.templateName = templateName;
        this.templateContent = templateContent;
        this.remark = remark;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public String getTemplateName() {
        return templateName;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public String getRemark() {
        return remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String templateCode;
        private Integer templateType;
        private String templateName;
        private String templateContent;
        private String remark;

        public Builder() {
        }

        public Builder templateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }

        public Builder templateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }

        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public Builder templateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public ModifySmsTemplateRequest build() {
            return new ModifySmsTemplateRequest(templateCode, templateType, templateName, templateContent, remark);
        }
    }
}

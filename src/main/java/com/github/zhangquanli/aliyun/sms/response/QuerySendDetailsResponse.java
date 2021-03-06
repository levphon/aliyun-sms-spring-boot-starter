package com.github.zhangquanli.aliyun.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zhangquanli.aliyun.sms.http.AbstractResponse;

/**
 * QuerySendDetailsResponse
 *
 * @author zhangquanli
 */
public class QuerySendDetailsResponse extends AbstractResponse {

    /**
     * 描述：短信发送总条数。
     * 示例：1
     */
    @JsonProperty("TotalCount")
    private String totalCount;
    /**
     * 描述：短信发送明细。
     */
    @JsonProperty("SmsSendDetailDTOs")
    private SmsSendDetailDTOs smsSendDetailDTOs;

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public SmsSendDetailDTOs getSmsSendDetailDTOs() {
        return smsSendDetailDTOs;
    }

    public void setSmsSendDetailDTOs(SmsSendDetailDTOs smsSendDetailDTOs) {
        this.smsSendDetailDTOs = smsSendDetailDTOs;
    }
}

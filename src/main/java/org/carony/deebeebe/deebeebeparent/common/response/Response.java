package org.carony.deebeebe.deebeebeparent.common.response;

import lombok.Data;

/**
 * @author Caron
 * @date 2019-08-30
 */
@Data
public class Response {

    public static final String STATUS_OK = "ok";
    public static final String STATUS_FAIL = "fail";

    private String status;
    private String errorMsg;
    private Integer errorCode;
    private Object data;

    public Response(String status) {
        this.setStatus(status);
    }
}

package org.carony.deebeebe.deebeebeparent.common.controller;

import org.carony.deebeebe.deebeebeparent.common.response.Response;

import static org.carony.deebeebe.deebeebeparent.common.response.Response.STATUS_FAIL;
import static org.carony.deebeebe.deebeebeparent.common.response.Response.STATUS_OK;

/**
 * @author Caron
 * @date 2019-08-30
 */
public class BaseController {

    protected Response ok() {
        return new Response(STATUS_OK);
    }

    protected Response ok(Object data) {
        Response res = new Response(STATUS_OK);
        res.setData(data);
        return res;
    }

    protected Response fail(String msg) {
        Response res = new Response(STATUS_FAIL);
        res.setErrorMsg(msg);
        return res;
    }

    protected Response fail(String msg, Integer code) {
        Response res = new Response(STATUS_FAIL);
        res.setErrorMsg(msg);
        res.setErrorCode(code);
        return res;
    }
}

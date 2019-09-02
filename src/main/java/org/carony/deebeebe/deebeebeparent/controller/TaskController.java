package org.carony.deebeebe.deebeebeparent.controller;

import org.carony.deebeebe.deebeebeparent.common.controller.BaseController;
import org.carony.deebeebe.deebeebeparent.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Caron
 * @date 2019-08-30
 */
@RestController
@RequestMapping(path = "/task")
public class TaskController extends BaseController {

    @GetMapping("/list")
    public Response getTaskByDate() {
        return ok();
    }

    @PostMapping("/do")
    public Response doTask() {
        return ok();
    }

}

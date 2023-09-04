package com.atguigu.blog.exception;
import com.atguigu.blog.utils.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// 专门用来处理异常的控制器（handler,注意其实跟其他handler同级，某种意义上来说也算是一个servlet）
// 当某个servlet中出现异常，本来会把exception对象传给dispatcherServlet
// 但配置统一异常处理的handler之后，exception对象会被传给这个异常控制器,然后再返回一个result给dispatcherServlet
// 因为它也是一种控制器(handler,controller)，所以可以用@Controller注解和@RestController注解，且配合声明式异常处理
// 为给前端发送一个json，最终使用的注解是@RestControllerAdvice（= @ResponseBody+@ControllerAdvice）
@RestControllerAdvice
public class CustomExceptionHandler {


    //将exception捕获之后，这个servlet会返回Result作响应
    //@ExceptionHandler的属性是用来设定需要捕获的异常的种类的，传入该异常的class对象即可
    @ExceptionHandler(Exception.class)
    public Result handleException(){
        return Result.fail().message("服务器故障");
    }
}

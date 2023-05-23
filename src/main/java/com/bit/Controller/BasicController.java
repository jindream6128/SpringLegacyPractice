package com.bit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class BasicController {
    //이건 RequestMapping은 뭐지? -> 기본적으로 그까지 가야한다 -> RequestMapping 절대경로 뒤에 올 경로 (앞 뒤 절대경로는 value로 들어가있음)
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String helloMessage(Model model){
        System.out.println("helloHome");
        model.addAttribute("message", "BasicController");
        return "basicView/MessageView";
    }

    //default가 get이다!
    @GetMapping(value = "/lesson")
    public ModelAndView lessonMessage(){
        //modelandview 객체 생성
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lesson", "SpringLesson");
        modelAndView.setViewName("basicView/messageLesson"); //위에 RequestMapping에서 return한거랑 이렇게 setViewName이랑 같은거다.

        return modelAndView;
    }


    //index.jsp 에서 post로 보내서 postMapping으로 받아야한다
    //만약 Post로 보냈는데 GET으로 받게 되면 405 오류가 뜬다
    //한꺼번에 수십개의 인자가 들어올대는 bean으로 받는다 !
    @PostMapping(value = "/empValue")
    public String empValue(@RequestParam(value="job",required = false, defaultValue ="doctor")String job,
                           @RequestParam(value = "sal", required = false,defaultValue = "1000")int sal, Model model){
        //이렇게 RequestParam에 defaultValue값을 주면 해당 null 이 입력되면 해당값이 들어가게 된다.

        //public String empValue(String job, int sal, Model model){ 원래 코드

        model.addAttribute("job",job);
        model.addAttribute("sal", sal);
        //job으로 job을 넣어서 해당 경로에 job을 넣는다.
        return "basicView/empValue";
    }

    /*@PostMapping(value = "/lessonCheck")
    public String lessonCheck(@RequestParam(value="lesson",required = false, defaultValue = "선택된 것이 없습니다")String lesson, Model model){
      //public String lessonCheck()
        model.addAttribute("lesson", lesson);
        return "basicView/lessonCheck";
    }*/


    @PostMapping(value="/lessonCheck")
    public String lessonCheckProcess(Model model, HttpServletRequest request) {
        String[]chValue=request.getParameterValues("lesson");
        //여러개를 받을때는 -> 배열로 받아서 -> 데이터를 가공하기 -> 디스패처에서 조건을 걸어서 사용하기 위함!
        model.addAttribute("chValue",chValue);
        return "basicView/lessonCheck";
    }

    @RequestMapping(value = "adminLogin")
    public String adminLogin(){
        return "mvcDemo/adminLogin";
    }

    @PostMapping(value = "/loginchk")
    public String loginchk(String user_id, String user_passwd){

        System.out.println(user_id + user_passwd);

        //로그인 성공 여부
        if(user_id.equals("admin") && user_passwd.equals("admin")){
            return "mvcDemo/list";
        }else {
            return "mvcDemo/adminLogin";
        }
    }

    @RequestMapping(value = "list")
    public String list(){
        return "mvcDemo/list";
    }
}




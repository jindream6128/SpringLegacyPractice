package com.bit.di.basic2;

import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component  //어노테이션 ㄷㄱㄷㄱ 여기 Component는 컴포넌트 스캔으로 여기를 해댱한다.
public class BookStore {
    //@Autowired -> 스프링 컨테이너에서 적당한 빈을 찾아주는것이다 -> 1개일때는 알아서 잡아주고, 여러개일때는 Qulifier를 통해 해당하는것을 사용한다. => 이과정에서 DI! 해당 빈을 연결시켜준다.
    //@Autowired 는 주로 멤버변수에다가 사용을 한다. -> 메소드나 생성자에다가 사용을 하지않는다 -> 생성자사용-> 띠용? 우리가 그냥 파라미터로 값을 넣어서 생성을할수도있는데 이글 굳이 라는 느낌
    //그래서 멤버변수에다가 사용을 한다 !
    // 찾아볼 것 ,Spring
    //@Autowired //타입을 보고 -> springcontainer 에서 book이라는 bean을 가지고오겠다. ->  근데 1개만 가지고 오겠다!
    //@Qualifier(value = "qv2") //Autowired는 만들어져있는 bean들중 1개만 di를 하는것인데 이 qv3를보고 만들어 주겠따라는 의미 !
    private Book book;

    public Book getBook() {
        return book;
    }

    //  @Inject //이클립스jsp 전용
    @Autowired
   // @Qualifier (value = "qv3")
    public void setBook(Book book) {
        this.book = book;
    }

    public BookStore() {
        super();
    }


    public BookStore(Book book) {
        this.book = book;
    }

  /*  @Autowired //만약 여기해버리면 멤버변수의 book과 파라미터의 book은 다른것이다, 따라서 여기에 있는 book에 들어간다
    public void test(Book book){
        System.out.println(book);
    }*/


  //  @Override
    public String toString() {
        return "BookStore{" +
                "book=" + book +
                '}';
    }
}

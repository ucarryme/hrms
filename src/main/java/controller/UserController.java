package controller;

import entity.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tool.EncodingTool;


import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller

public class UserController {

    public Session getSession(){
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return  session;
    }

    @PostMapping("/login.do")
    public String checkLogin(@RequestParam String username,@RequestParam String password){
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        String hql = "from Users";
        Query query= session.createQuery(hql);
        List list=query.list();
        //对查询的结果进行遍历
        for (int i = 0; i < list.size(); i++) {
            Users user=(Users) list.get(i);

           if(user.getUsername().equals(username)&&(user.getPassword().equals(password))){
               System.out.println(username);
               System.out.println(password);
               tx.commit();
               session.close();
               return"manage";
           }
        }
        session.close();
        return "failed";
    }
    @PostMapping("/adduser.do")
    public  String addUser(HttpServletRequest request,@RequestParam String username,@RequestParam String password,
                           @RequestParam Timestamp createtime,@RequestParam boolean sex,@RequestParam boolean isadmin,
                           @RequestParam String content) throws ParseException {
        System.out.println(content);
        EncodingTool encodingTool = new EncodingTool();
        Users users = new Users();
        users.setUsername(encodingTool.encodeStr(username));
        users.setPassword(password);

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false); //要转换字符串str_test
        String str_test = request.getParameter("birthday");
        try {
            Timestamp ts = new Timestamp(format.parse(str_test).getTime());
            System.out.println(ts.toString());
            users.setBirthday(ts);
        }
        catch (ParseException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }
        users.setSex(sex);
        users.setCreatetime(createtime);
        users.setContent(encodingTool.encodeStr(content));
        users.setIsadmin(isadmin);
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.save(users);
        tx.commit();
        session.close();
        System.out.println(createtime);

        return "adduser";
    }
    @GetMapping("user.do")
    public String getuser(HttpServletRequest request){
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        ModelAndView mv = new ModelAndView();
        String hql = "from Users";
        Query query= session.createQuery(hql);
        List list=query.list();

        //对查询的结果进行遍历
        request.setAttribute("users",list);
      return "listuser";
    }
}

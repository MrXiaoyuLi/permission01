package org.Vote.test;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestMail {

	public static void main(String[] args) throws Exception, Exception {
		//1.设置邮件服务器的属性信息
		Properties props = new Properties();
		//smtp.qq.com
		props.setProperty("mail.smtp.host","smtp.126.com");
		props.setProperty("mail.smtp.auth","true");
		//2.创建会话：需要账号和密码
		Session session =Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("lixiaoyu6655@126.com","lixiaoyu6655082");
			}
		});
		//3.创建邮件：发件人，收件人，主题，内容，发送时间
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress("lixiaoyu6655@126.com"));
		message.setRecipient(RecipientType.TO, new InternetAddress("185426109@qq.com"));
		message.setSubject("ni hao a !");
		message.setContent("ni zai na a !","text/html"); 
		message.setSentDate(new Date());
		
		//4.发送邮件
		Transport.send(message,message.getAllRecipients());
		
		System.out.println("send success!");
		
	}

}

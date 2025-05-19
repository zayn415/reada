package com.zayn.reada.utils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 邮箱工具类
 *
 * @author zayn
 * @since 2025/5/12
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmailUtil {
    
    private final JavaMailSender mailSender;
    
    public Boolean sendEmailCode(String to, String code) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setFrom("1563305062@qq.com");
        message.setSubject("验证码");
        message.setText(code);
        try {
            mailSender.send(message);
            return true;
        } catch (MailException e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }
}

package main.java.ru.geekbrains.lesson4.homework;

import java.util.Date;
/**
 * Билет
 */
public class Ticket {
    private int id;

    private int customerId;

    private Date date;

    private String qrcode = "qrcode";

    private boolean enable = true;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }
}

package com.furkantokgoz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Data //data lombok annotation'ı eklendi fakat göstermek için Getter,Setter metodları da eklenmiştir.
@Log4j2
@NoArgsConstructor
public class BeanDto {
    private long id;
    private String beanName;
    private String beanData;

    //start
    public void initialBean(){
        log.info("[+] service started");
        //Method will start before bean started.
    }
    //end
    public void finalBean(){
        log.info("[-] service finished");
        System.err.println("[*] service finished");
        //Method will start after bean stopped.
    }


    public BeanDto(long id, String beanName,String beanData) {
        this.beanData = beanData;
        this.beanName = beanName;
        this.id = id;
    }

    public String getBeanData() {
        return beanData;
    }

    public String getBeanName() {
        return beanName;
    }

    public long getId() {
        return id;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void setBeanData(String beanData) {
        this.beanData = beanData;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"id\": \"" + getId() + "\",\n" +
                "  \"beanName\": \"" + getBeanName() + "\",\n" +
                "  \"beanData\": \"" + getBeanData() + "\"\n" +
                "}";
    }

}

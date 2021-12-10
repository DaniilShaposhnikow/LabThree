package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //1//
        Bombadirovka bombadirovka = new Bombadirovka();
        bombadirovka.vozobnovilas();
        System.out.print(bombadirovka.vozobnovilas());
        //2//
        Zhar zhar = new Zhar();
        zhar.zhar();
        System.out.print(zhar.zhar());
        //3//
        Shum shum = new Shum();
        shum.sh();
        System.out.print(shum.sh());
        //4//
        CompBank compBank = new CompBank();
        compBank.destroy();
        System.out.print(compBank.destroy());
        //5//
        LicevSt licevSt = new LicevSt();
        licevSt.raspl();
        System.out.print(licevSt.raspl());
        //6//
        GustRuch gustRuch = new GustRuch();
        gustRuch.zap();
        System.out.print(gustRuch.zap());
        gustRuch.sid();
        System.out.print(gustRuch.sid());
        gustRuch.sgrud();
        System.out.print(gustRuch.sgrud());
        gustRuch.zhd();
        System.out.print(gustRuch.zhd());
    }
}

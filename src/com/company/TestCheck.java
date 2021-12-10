package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestCheck
{
    @Test
    public void Bombardirovka()
    {
        Bombadirovka bomb = new Bombadirovka();
        Assert.assertEquals("Бомбардировка возобновилась. ", bomb.vozobnovilas());
    }

    @Test
    public void Zhar()
    {
        Zhar zhar = new Zhar();
        Assert.assertEquals("Жар ", zhar.zhar());
    }

    @Test
    public void Shum()
    {
        Shum shum = new Shum();
        Assert.assertEquals(" и шум были невообразимыми.", shum.sh());
    }

    @Test
    public void CompBank()
    {
        CompBank compBank = new CompBank();
        Assert.assertEquals("Компьютерный банк начал понемногу разваливаться на куски.", compBank.destroy());
    }

    @Test
    public void LicevSt()
    {
        LicevSt licevSt = new LicevSt();
        Assert.assertEquals("Лицевая сторона его почти вся расплавилась, ", licevSt.raspl());
    }

    @Test
    public void GustRuchZap()
    {
        GustRuch gustRuchZap = new GustRuch();
        Assert.assertEquals("и густые ручейки расплавленного металла начали заползать в угол, ", gustRuchZap.zap());
    }

    @Test
    public void GustRuchSid()
    {
        GustRuch gustRuchSid = new GustRuch();
        Assert.assertEquals("в котором они сидели.", gustRuchSid.sid());
    }

    @Test
    public void GustRuchSgrud()
    {
        GustRuch gustRuchSgrud = new GustRuch();
        Assert.assertEquals("Они сгрудились плотнее", gustRuchSgrud.sgrud());
    }

    @Test
    public void GustRuchzhd()
    {
        GustRuch gustRuchzd = new GustRuch();
        Assert.assertEquals("   и стали ждать конца. ", gustRuchzd.zhd());
    }

}

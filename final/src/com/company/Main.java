package com.company;

import com.company.bridge.*;
import com.company.strategy.*;
import com.company.decorator.*;
import com.company.facade.*;
import com.company.observer.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int  choice;

    public static void main(String[] args) throws NumberFormatException, IOException{
        System.out.println("STRATEGY PATTERN");
        Soldier terror = new Terror();
        terror.gunfire();
        terror.useBomb();
        terror.useGun();
        terror.useHostages();
        System.out.println("-----------");
        Soldier ct = new CounterTerror();
        ct.gunfire();
        ct.useBomb();
        ct.useGun();
        ct.useHostages();

        System.out.println("-----------------------------------------------");
        System.out.println("BRIDGE PATTERN");
        System.out.println("The user receives a gun.");
        Gun gun = new Gun(new SetupWeapon());
        gun.wield();
        gun.swing();
        gun.unwield();
        System.out.println("-----------------");
        System.out.println("The user receives a Glasses.");
        Glasses glasses = new Glasses(new XrayVision());
        glasses.wield();
        glasses.swing();
        glasses.unwield();

        System.out.println("-----------------------------------------------");


        System.out.println("DECORATOR PATTERN");
        System.out.println("Terrorists:");
        Player simple = new WithSkinsDecorator(new Terrorist("s1mple"));
        Player electonic = new WithSkinsDecorator(new Terrorist("electronic"));
        Player boomi4 = new WithoutSkinsDecorator(new Terrorist("boomi4"));
        Player perfecto = new WithoutSkinsDecorator(new Terrorist("perfecto"));
        Player b1t = new WithSkinsDecorator(new Terrorist("b1t"));

        simple.play();
        electonic.play();
        boomi4.play();
        perfecto.play();
        b1t.play();

        System.out.println("Counter Terrorists:");
        Player hunter = new WithoutSkinsDecorator(new CounterTerrorist("hunter"));
        Player monesy = new WithSkinsDecorator(new CounterTerrorist("monesy"));
        Player flamie = new WithSkinsDecorator(new CounterTerrorist("flamie"));
        Player hector = new WithoutSkinsDecorator(new CounterTerrorist("hector"));
        Player buster = new WithSkinsDecorator(new CounterTerrorist("buster"));

        hunter.play();
        monesy.play();
        flamie.play();
        hector.play();
        buster.play();

        System.out.println("-----------------------------------------------");
        System.out.println("OBSERVER PATTERN");
        Subject subject = new Subject();

        new Commentator1(subject);
        new Commentator3(subject);
        new Commentator2(subject);

        System.out.println("Observers noticed that the bomb was placed:");
        subject.setState(15);
        System.out.println("-----------------------------------------------");

        System.out.println("FACADE PATTERN");
        do{
            System.out.print("========= Steam Shop ============ \n");
            System.out.print("            1. AK-47 | FIRE SERPENT.              \n");
            System.out.print("            2. DEAGLE | FLAME.              \n");
            System.out.print("            3. AWP | DRAGON LORE.            \n");
            System.out.print("            4. M4A4 | HOWL.            \n");
            System.out.print("            5. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.akSale();
                }
                break;
                case 2:
                {
                    sk.deagleSale();
                }
                break;
                case 3:
                {
                    sk.awpSale();
                }
                break;
                case 4:
                {
                    sk.m4a4Sale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=5);

    }
}

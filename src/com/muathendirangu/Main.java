package com.muathendirangu;

import com.muathendirangu.behavioral.chainofresponsibility.Bank;
import com.muathendirangu.behavioral.chainofresponsibility.Bitcoin;
import com.muathendirangu.behavioral.chainofresponsibility.PayPal;
import com.muathendirangu.behavioral.command.OpenTextFileOperation;
import com.muathendirangu.behavioral.command.SaveTextFileOperation;
import com.muathendirangu.behavioral.command.TextFile;
import com.muathendirangu.behavioral.command.TextFileOperationExecutor;
import com.muathendirangu.behavioral.mediator.Button;
import com.muathendirangu.behavioral.mediator.Fan;
import com.muathendirangu.behavioral.mediator.Mediator;
import com.muathendirangu.behavioral.mediator.PowerSupply;
import com.muathendirangu.creational.abstractfactory.IronDoorFactory;
import com.muathendirangu.creational.abstractfactory.WoodenDoorFactory;
import com.muathendirangu.creational.builder.BurgerBuilder;
import com.muathendirangu.creational.factory.DesignManager;
import com.muathendirangu.creational.factory.EngineeringManager;
import com.muathendirangu.structural.adapter.Hunter;
import com.muathendirangu.structural.adapter.WildDog;
import com.muathendirangu.structural.adapter.WildDogAdapter;
import com.muathendirangu.structural.bridge.*;
import com.muathendirangu.structural.decorator.DecorateWIthBubbleLights;
import com.muathendirangu.structural.decorator.XmasTree;

public class Main {

    public static void main(String[] args) throws Exception {
	// simple factory implementation
//        var mainDoor = DoorFactory.makeDoor(100, 700);
//        System.out.println(mainDoor.getWidth());
//        System.out.println(mainDoor.getHeight());


        //complex factory pattern implementation
        var developerInterviewer = new EngineeringManager();
        developerInterviewer.conductInterview();
        var designInterviewer = new DesignManager();
        designInterviewer.conductInterview();

        System.out.println("**********************************");
        System.out.println("**********************************");

        //abstract factory pattern implementation
        var woodenFactory = new WoodenDoorFactory();
        var woodenDoorExpert = woodenFactory.assignFixingDoorExpert();
        var woodenDoor = woodenFactory.makeDoor();

        woodenDoorExpert.getDescription();
        woodenDoor.getDescription();

        System.out.println("**********************************");

        var ironDoorFactory = new IronDoorFactory();
        var ironDoorExpert = ironDoorFactory.assignFixingDoorExpert();
        var ironDoor = ironDoorFactory.makeDoor();

        ironDoorExpert.getDescription();
        ironDoor.getDescription();

        System.out.println("**********************************");
        System.out.println("**********************************");


        //builder pattern implementation
        BurgerBuilder burgerBuilder = new BurgerBuilder(15);
        burgerBuilder.addCheese();
        burgerBuilder.addLettuce();
        burgerBuilder.addPeperoni();
        burgerBuilder.addTomato();
        burgerBuilder.build();

        System.out.println("**********************************");
        System.out.println("**********************************");


        /*
        * STRUCTURAL PATTERNS
        * */
        //Adapter pattern
        var wildDog = new WildDog();
        var wildDogAdapter = new WildDogAdapter(wildDog);

        System.out.println("**********************************");

        var hunter = new Hunter();
        hunter.hunt(wildDogAdapter);

        System.out.println("**********************************");
        System.out.println("**********************************");

        //bridge pattern
        var darkTheme = new DarkTheme();
        var about = new About(darkTheme);
        System.out.println(about.getContent());

        var lightTheme = new LightTheme();
        var project = new Project(lightTheme);
        System.out.println(project.getContent());

        var aqua = new AquaTheme();
        var careers = new Career(aqua);
        System.out.println(careers.getContent());

        System.out.println("**********************************");
        System.out.println("**********************************");

        //decorator pattern
        var xmasTree = new XmasTree();
        var decorateWithBubbleLights = new DecorateWIthBubbleLights(xmasTree);
        System.out.println(decorateWithBubbleLights.Decorate());


        /*
         * BEHAVIORAL PATTERNS
         * */
        //chain of responsibility pattern
        // Let's prepare a chain like below
        //      bank -> payPal -> bitcoin
        //
        // First priority bank
        //      If bank can't pay then payPal
        //      If payPal can't pay then bitcoin

        var bank = new Bank(100); // deposit amount 100 to bank
        var payPal = new PayPal(100); // deposit amount 200 to the PayPal account
        var bitcoin = new Bitcoin(400); // deposit amount 400 to the Bitcoin account
        bank.setSuccessor(payPal); // set the next payment processor to be payPal if current balance(Bank) is insufficient to complete the purchase
        payPal.setSuccessor(bitcoin); // set the next payment processor to be bitcoin if current balance(PayPal) is insufficient to complete the purchase
        //let us try 300 using our first priority which is bank
        bank.pay(300);

        //command pattern
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();

        textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.txt")));

        Button button = new Button();
        Fan fan = new Fan();
        PowerSupply powerSupply = new PowerSupply();

        Mediator mediator = new Mediator();
        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupply(powerSupply);

    }
}

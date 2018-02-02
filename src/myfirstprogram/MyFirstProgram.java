
package myfirstprogram;

import testobject.Computer;

public class MyFirstProgram {
   
    public static void main(String[] args) {
       /* Computer comp = new Computer();
        
        comp.setName("Mac");
        comp.setRam(1024); 
        comp.setHdd(500);
        comp.setWeight(5.5);
        comp.setMotherboardName(1);
       
        
        comp.on();
        comp.load();
        comp.off();    */
       int i;
        for(i=0; i<15; i++){
           /* if(i<1){
                System.out.println("Значение номера месяца не допустимо!");
            }
            else {
                if(i>12){
                    System.out.println("Значение номера месяца не допустимо!");
                }
            }*/
            
            //if(i==12 || i==1 || i==2){
                
            switch (i){
                case 12:
                case 1:
                case 2:             
               
                System.out.print("Зимний месяц: ");
                switch(i){
                    case 12:
                        System.out.println("Декабрь.");
                        break;
                    case 1:
                        System.out.println("Январь.");
                        break;
                    case 2:
                        System.out.println("Февраль.");
                        break;
                            
                }
            }
            
            if(i==3 || i==4 ||i==5){                
                switch(i){
                    case 3:
                        System.out.println("Весенний месяц: Март.");
                        break;
                    case 4:
                        System.out.println("Весенний месяц: Апрель.");
                        break;
                    case 5:
                        System.out.println("Весенний месяц: Май.");
                        break;
                            
                }
            }
            
            if(i==6 || i==7 ||i==8){
                switch(i){
                    case 6:
                        System.out.println("Летний месяц: Июнь.");
                        break;
                    case 7:
                        System.out.println("Летний месяц: Июль.");
                        break;
                    case 8:
                        System.out.println("Летний месяц: Август.");
                        break;
                            
                }
            }
            
            if(i==9 || i==10 ||i==11){
                switch(i){
                    case 9:
                        System.out.println("Осенний месяц: Сентябрь.");
                        break;
                    case 10:
                        System.out.println("Осенний месяц: Октябрь.");
                        break;
                    case 11:
                        System.out.println("Осенний месяц: Ноябрь.");
                        break;
                            
                }
            }
        }
    }
          
}

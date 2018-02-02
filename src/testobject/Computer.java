
package testobject;

public class Computer {
    
    private String name;    
    private int ram;    
    private int hdd;    
    private double weight;
    
    private int motherboardName;
    
    private int soket;
    
    private String cp;
    
    private String videoCard;
    
    public int getMotherboardName(){
        return motherboardName;
    }
    
    public void setMotherboardName(int newMotherboardName){ 
        motherboardName=newMotherboardName;        
        if(newMotherboardName==0){            
            System.out.println("Материнская плата фирмы Asus");
        }
        else if(newMotherboardName==1){            
            System.out.println("Материнская плата фирмы Gigabit");
        }
        else if(newMotherboardName==2){            
            System.out.println("Материнская плата фирмы Microsoft");
        }
        else {
            System.out.println("No name matherbord");
        }
    } 
    
    public double getWeight(){
        return weight;
    }    
    public void setWeight(double newWeight){
        if(newWeight>0){
            weight=newWeight;
            System.out.println("Вес системного блока равен: "+newWeight+ " кг.");        
        }
        else {
            System.out.println("Вес устройства, не может быть меньше ноля!");
        }
    }   
    public String getName(){
        return name;        
    }    
    public void setName(String newName){        
        name = newName;
    }    
    public int getRam(){
        return ram;
    }    
    public void setRam(int newRam){     
        if(newRam>0){
        ram = newRam;
        System.out.println("Объеём оперативной памяти равен: "+ newRam);
        }
        else{
            System.out.println("Значение " + newRam + " недопустимо!");
        }
    }    
    public int getHdd(){
        return hdd;
    }    
    public void setHdd(int newHdd){     
        if(newHdd>0){
        hdd = newHdd;
        }
        else{
            System.out.println("Значение " + newHdd + " недопустимо!");
        }
    }    
    public void on(){        
        System.out.println("Я включился. Моя модель: " + name);
    }    
    public void off(){
        System.out.println("Я выключился. Вес системного блока равен: "+weight+ " кг.");
    }    
    public void load(){
        System.out.println("Я загружаюсь. Мой объем жёсткого диска равен: " + hdd + " Гб");
    }    
}

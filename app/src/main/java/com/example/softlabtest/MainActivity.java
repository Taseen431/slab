package com.example.softlabtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


class color{
    public String name ;
    public color(String name){
        this.name = name ;
    }
    public String showColor() {
        return "The color is " + name + "\n";
    }
}

class Red extends color{
    public Red(){
        super("Red");
    }
}

class Green extends color{
    public Green(){
        super("Green");
    }
}

class Blue extends color{
    public Blue(){
        super("Blue");
    }
}

class Vehicle {
    private int wheels;
    private double fuel;
    private double mileage;

    public String name ;
    public vehicle (String name){
        this.name = name ;
    }
    public String showColor() {
        return "The vehicle is " + name + "\n";
    }
    public Vehicle() {
        this.wheels = 0;
        this.fuel = 0.0;
        this.mileage = 0.0;
    }

    public int wheels() {
        return wheels;
    }

    public double fuel() {
        return fuel;
    }

    public double milage() {
        return mileage;
    }

    public void petro(double amount) {
        this.fuel += amount;
    }

    public void drive() {
        return 0;
    }
}

class Sedan extends Vehicle {
    @Override
    public void drive() {
        if (fuel() >= 2.0) {
            System.out.println("Driving 1.5 miles in Sedan.");
            this.fuel -= 2.0;
            this.mileage += 1.5;
        } else {
            System.out.println("Not enough fuel to drive Sedan.");
        }
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void drive() {
        if (fuel() >= 2.5) {
            System.out.println("Driving 4 miles in Motorcycle.");
            this.fuel -= 2.5;
            this.mileage += 4.0;
        } else {
            System.out.println("Not enough fuel to drive Motorcycle.");
        }
    }
}

class SUV extends Vehicle {
    @Override
    public void drive() {
        if (fuel() >= 2.5) {
            System.out.println("Driving 4 miles in SUV.");
            this.fuel -= 2.5;
            this.mileage += 4.0;
        } else {
            System.out.println("Not enough fuel to drive SUV.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.petro(5.0);
        sedan.drive();
        System.out.println("Sedan Mileage: " + sedan.milage());

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.petro(6.0);
        motorcycle.drive();
        System.out.println("Motorcycle Mileage: " + motorcycle.milage());

        SUV suv = new SUV();
        suv.petro(7.0);
        suv.drive();
        System.out.println("SUV Mileage: " + suv.milage());
    }
}






public class MainActivity extends AppCompatActivity {

    public EditText VehicleEditText, ColorEditText;
    public Button button;
    public TextView VehicleTextView, ColorTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleEditText = findViewById(R.id.ShapeEditText);
        ColorEditText = findViewById(R.id.ColorEditText);
        button = findViewById(R.id.button);
        VehicleTextView = findViewById(R.id.ShapeTextView);
        ColorTextView = findViewById(R.id.ColorTextView);

        button.setOnClickListener(v -> {
            String vehicle = VehicleEditText.getText().toString();
            String color = ColorEditText.getText().toString();

            if (Vehicles.equals("sedan")) {
                Vehicle c = new Vehicle();
                ShapeTextView.setText(c.showShape());
            } else if (shape.equals("Square")) {
                Square s = new Square(5);
                ShapeTextView.setText(s.showShape());
            } else if (shape.equals("Triangle")) {
                Triangle t = new Triangle(3, 4, 5);
                ShapeTextView.setText(t.showShape());
            } else {
                ShapeTextView.setText("Invalid Shape");
            }

            if (color.equals("Red")) {
                Red r = new Red();
                ColorTextView.setText(r.showColor());
            } else if (color.equals("Green")) {
                Green g = new Green();
                ColorTextView.setText(g.showColor());
            } else if (color.equals("Blue")) {
                Blue b = new Blue();
                ColorTextView.setText(b.showColor());
            } else {
                ColorTextView.setText("Invalid Color");
            }
        });
    }
}
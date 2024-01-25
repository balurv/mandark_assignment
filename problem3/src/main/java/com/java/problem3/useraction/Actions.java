package com.java.problem3.useraction;

import com.java.problem3.input.MultiInput;
import com.java.problem3.input.SingleInput;
import com.java.problem3.operations.BasicCalculator;
import com.java.problem3.operations.ScientificCalculator;

public enum Actions {
    Addition{
        @Override
        public void perform() {
            int[] var = MultiInput.UserInput();
            try {
                System.out.println("The answer is : " + BasicCalculator.Add(var[0], var[1]));
            }
            catch (Exception ignored){

            }
        }
    },
    Subtraction {
        @Override
        public void perform() {
            int[] var = MultiInput.UserInput();
            try {
                System.out.println("The answer is : " + BasicCalculator.Subtract(var[0], var[1]));
            }
            catch (Exception ignored){
            }
        }
    },
    Multiplication {
        @Override
        public void perform() {
            int[] var = MultiInput.UserInput();
            try {
                System.out.println("The answer is : " + BasicCalculator.Multiply(var[0], var[1]));
            }
            catch (Exception ignored){
            }
        }
    },
    Division {
        @Override
        public void perform() {
            int[] var = MultiInput.UserInput();
            try {
                System.out.println("The answer is : " + BasicCalculator.Divide(var[0], var[1]));
            }
            catch (Exception ignored){
            }
        }
    },
    PowerOf {
        @Override
        public void perform() {
            int[] var = MultiInput.UserInput();
            try {
                System.out.println("The answer is : " + BasicCalculator.PowerOf(var[0], var[1]));
            }
            catch (Exception ignored){
            }
        }
    },
    SquareRoot {
        @Override
        public void perform() {
            double d1 = SingleInput.UserInput();
            try {
                System.out.println("The answer is : " + ScientificCalculator.sqrt(d1));
            }
            catch (Exception ignored){
            }
        }
    },

    Logarithmic {
        @Override
        public void perform() {
            int var =  SingleInput.UserInput();
            try {
                System.out.println("The answer is : " + ScientificCalculator.logOf(var));
            }catch (Exception ignored){
            }
        }
    },
    Natural_Log {
        @Override
        public void perform() {
            int var =  SingleInput.UserInput();
            try {
                System.out.println("The answer is : " + ScientificCalculator.logn(var));
            }catch (Exception ignored){
            }
        }
    },
    Sine {
        @Override
        public void perform() {
            double d1 = SingleInput.UserInput();
            System.out.println("The answer is : " + ScientificCalculator.Sin(d1));

        }
    },
    Inverse_Sine {
        @Override
        public void perform() {
            double d1 =  SingleInput.UserInput();
            System.out.println("The answer is : " + ScientificCalculator.iSin(d1));

        }
    },
    Cosine {
        @Override
        public void perform() {
            double d1 =  SingleInput.UserInput();
            System.out.println("The answer is : " + ScientificCalculator.Cos(d1));

        }
    },
    Inverse_Cosine {
        @Override
        public void perform() {
            double d1 =  SingleInput.UserInput();
            System.out.println("The answer is : " + ScientificCalculator.iCos(d1));

        }
    },
    Tangent {
        @Override
        public void perform() {
            double d1 =  SingleInput.UserInput();
            System.out.println("The answer is : " + ScientificCalculator.Tan(d1));

        }
    },
    Inverse_Tangent {
        @Override
        public void perform() {
            double d1 =  SingleInput.UserInput();
            System.out.println("The answer is : " + ScientificCalculator.iTan(d1));

        }
    };

    public static Actions getActionsByIndex(int index){
        Actions[] actions = Actions.values();
        if(index >= 0 && index < actions.length){
            return actions[index];
        }
        return null;
    }
    public abstract void perform();
}

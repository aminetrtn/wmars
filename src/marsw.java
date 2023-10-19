public class marsw {

        public static void main(String[] args) {
            float earthWeight;
            float marsWeight;
            double marsWeightInDouble;
            int marsWeightInInt;

            earthWeight = 65;
            marsWeight = (earthWeight *0.38F);
            System.out.println(earthWeight+" kg on Earth is " + marsWeight +" kg on Mars");
//assignment (compatible types) from float to double
            marsWeightInDouble = marsWeight;
            System.out.println("Kilograms on Mars after converting to double "+marsWeightInDouble);
//printing a variable limiting the length of printing to 4 decimal places
            System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDouble);
}
}

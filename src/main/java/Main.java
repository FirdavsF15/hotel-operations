public class Main {

    public static void main(String[] args) {

        Reservation vacay = new Reservation("king", 3, true);

        System.out.println(vacay.getPrice());
        System.out.println(vacay.getReservationTotal());
        System.out.println(vacay.getNumberOfNights());

        Employee topEmployee = new Employee("Firdavs", "12345", "Software", 45.50, 45);

        System.out.printf("""
                total pay: %.2f
                regular hours: %.2f
                overtime hours: %.2f
                """, topEmployee.getTotalPay(), topEmployee.getRegularHours(), topEmployee.getOvertimeHours());
    }
}

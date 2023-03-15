fun main() {

   /* Typically, your phone provides you with a summary of notifications.

    In the initial code provided in the following code snippet, write a program that prints the summary
    message based on the number of notifications that you received. The message should include:
    The exact number of notifications when there are less than 100 notifications.
    99+ as the number of notifications when there are 100 notifications or more.*
    Complete the printNotificationSummary() function so that the program prints these lines:
     You have 51 notifications.
     Your phone is blowing up! You have 99+ notifications.*/

    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    ticketPrice(5, true)
    ticketPrice(28,true)
    ticketPrice(87, true)
}
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 99){
        println("You have $numberOfMessages notifications")

    } else {
        println("Your phone is blowing up, You have $numberOfMessages notifications")

    }

}
/*Movie tickets are typically priced differently based on the age of moviegoers.

In the initial code provided in the following code snippet, write a program that calculates these age-based ticket prices:

A children's ticket price of $15 for people 12 years old or younger.
A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.
Complete the ticketPrice() function so that the program prints these lines:*/


/*The movie ticket price for a person aged 5 is $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.*/

fun ticketPrice(age: Int, isMonday: Boolean){
    if (
        age <= 12 == isMonday){
        println("The movie ticket price for a person aged $age is $15")

    } else if (age >= 13  && age <= 60 == isMonday){
     println( "The movie ticket price for a person aged $age is $25")

    } else {
        println("The movie ticket price for a person aged $age is $20")
    }
}
package Labs.Lab4;

class DebuggingExercise4
{
    public static void main(String[] args)
    {
        Account a = null;
        a.deposit(100);
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        a.withdraw(200);
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
    }

    /*

    Which technique do you prefer? Why?
    I prefer debugging with GUI debugger because it offers better visual representation in my IDE and also if I am
    confused I can just pause and think.
    Are some debugging techniques more (or less) appropriate for longer programs?
    I think that GUI debugging is more appropriate in part of code were there are a lot of variable being changed
    and reassigned close to each other. While debugging with asserts is more appropriate for longer programs or programs
    with multiple loops.
    What are the advantages to using a debugger with a GUI?
        What can you inspect here that you couldn’t when just printing to the console?
        You can see exact logic of comparison booleans for example in if Statements.
    How can proper documentation help in finding and avoiding bugs?
        It would make it much easier to understand what the code is supposed to do and then compare it to what it
        actually does, therefore making it easier to find bugs.
     */
}
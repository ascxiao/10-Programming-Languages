using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        //Declare variables
        string name;
        double score_1, score_2, score_3;

        Console.WriteLine("Greetings, this is an average calculator in C# for three test scores.");
        Console.WriteLine("Please enter your name and three test scores.");
        Console.WriteLine("-------------------------------------------\n");

        //Input
        Console.Write("Name: ");
        name = Console.ReadLine();

        Console.WriteLine($"\nHello, {name}, enter your test scores");
        Console.Write("Score 1: ");
        score_1 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Score 2: ");
        score_2 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Score 3: ");
        score_3 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("-------------------------------------------");

        // Process
        double average = (score_1 + score_2 + score_3) / 3;

        // Output
        Console.WriteLine($"{name}, your average score is: {average:F2}");
        Console.WriteLine("-------------------------------------------");
    }

}

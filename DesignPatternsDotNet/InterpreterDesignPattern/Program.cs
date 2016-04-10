using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("We will convert BDT 1000 to other languages");
		    CurrencyContext bdtCurrency = new CurrencyContext(1000);
		    CurrencyExpression bdConvert = new BDTConverter();
		    bdConvert.interpret(bdtCurrency, "usd"); 
		    Console.WriteLine("After conversion "+bdtCurrency.Output.ToString());
            Console.ReadLine();
        }
    }
}

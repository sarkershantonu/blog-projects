using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
    public class CurrencyContext
    {
        private int input;
	    private double output;

        public int Input
        {
            get
            {
                return input;
            }
            set
            {
                input = value;
            }
        }
        public double Output
        {
            set
            {
                output = value;
            }
            get { return output; }
        }
	
	public CurrencyContext(int inp){
		this.input=inp;
	}
    }
}

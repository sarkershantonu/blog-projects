using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{   
    public class PlainBook : IBook
    {
        private string title = "Title : Decoretor Pattern";
        private string auther = " Auther : Shantonu";
        private string description = "";
        private double price = 300;
        public PlainBook()
        {
        }
        public string Description { get { return title + auther + " , this is Simple Book."; } set { description = value; } }
        public double Price { get { return price; } set { price = value; } }
    }
}

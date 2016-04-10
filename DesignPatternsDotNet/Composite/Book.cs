using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Composite
{
    public class Book : BookComponent
    {
        string name;
        string autherName;
        int publishedYear;
        public Book(string bookName, string author, int year)
        {
            name = bookName;
            autherName = author;
            publishedYear = year;
        }
        public string Name
        {
            get{
                return name;
            }
            set { 
                name = value; 
            } 
        }        
        public string AutherName
        {
             get{
                return autherName ; 
            }
            set { autherName = value ; 
            } 
        }        
        public int PublishedYear
        {
            get
            {
                return publishedYear;
            }
            set
            {
                publishedYear = value;
            }
        }
        public override void DisplayBookInfo()
        {
		    Console.WriteLine(Name+" was published by "+AutherName+" in "+PublishedYear);
        } 
    }
}

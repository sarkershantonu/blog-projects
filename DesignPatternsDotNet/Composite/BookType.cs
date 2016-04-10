using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace Composite
{
    public class BookType : BookComponent
    {
        ArrayList books = new ArrayList();
        string typeName;
        string typeDescription;
        public string TypeName
        {
            get
            {
                return typeName;
            }
            set { typeName = value; }
        }
        public string TypeDescription
        {
            get{
            return typeDescription;}
            set{typeDescription = value;
            }
        }
        public BookType(string name, string des)
        {
            typeName = name;
            typeDescription = des;
        }
        public override void Add(BookComponent aComponent)
        {
            books.Add(aComponent);
        }
        public override void Delete(BookComponent aComponent)
        {
            books.Remove(aComponent);
        }
        public override BookComponent GetComponent(int index)
        {
            return (BookComponent)books[index];
        }
        public override void DisplayBookInfo()
        {
		Console.WriteLine(TypeName+" "+TypeDescription);
        foreach (var i in books)
            {
            BookComponent aBook = (BookComponent)i;
            aBook.DisplayBookInfo();
            }
		
	    }
    }
}

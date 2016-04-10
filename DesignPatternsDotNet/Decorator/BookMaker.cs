using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{
   //This is decorator abstract which composite all decorators togather
    public abstract class BookMaker : IBook{
	protected IBook aBook;
	public BookMaker(IBook book) {
		aBook = book;
	}
    public virtual string Description { get {return aBook.Description;} set {aBook.Description = value;} }
    public virtual double Price { get { return aBook.Price; } set { aBook.Price = value; } }
	}
}

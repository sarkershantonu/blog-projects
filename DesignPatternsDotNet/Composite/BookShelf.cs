using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Composite
{
    public class BookShelf
    {
        BookComponent newBookList;
        public BookShelf(BookComponent bookType)
        {
            newBookList = bookType;
        }
        public void GetBookList()
        {
            newBookList.DisplayBookInfo();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Composite
{
    public abstract class BookComponent
    {
        public virtual void Add(BookComponent aComponent)
        {
            throw new NotSupportedException();
        }
        public virtual void Delete(BookComponent aComponent)
        {
            throw new NotSupportedException();
        }
        public virtual BookComponent GetComponent(int index)
        {
            throw new NotSupportedException();
        }
        public string GetName()
        {
            throw new NotSupportedException();
        }
        public string GetAutherName() 
        {
            throw new NotSupportedException();
        }
        public int GetPublishedYear()
        {
            throw new NotSupportedException();
        }
        //This is common function, if we implement only interface we can put it in interface
        public virtual void DisplayBookInfo()
        {
            throw new NotSupportedException();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{
    public interface IBook
    {
        string Description{get;set;}
        double Price { get; set; }
    }
}

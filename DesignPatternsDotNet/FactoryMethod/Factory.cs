using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FactoryMethod
{
    public class Factory : IFactory
    {
        Products productName;
        public IProduct CreateProduct()
        {
            switch (productName)
            {
                case Products.pen:
                    return new Pen();
                case Products.pencil:
                    return new Pencil();
            }
            return null;
        }
        public Factory(Products product)
        {
            this.productName = product;
        }
    }
}

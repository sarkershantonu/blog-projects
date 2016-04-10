using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public class NewsAgency:MyObservable
    {
        private List<String> news = new List<String>();

        public String Add
        {
            set
            {
                news.Add(value);
                base.hasChanged = true;
            }
        }
        public override void setChange()
        {
            base.hasChanged = true;
        }
        public override void clearChange()
        {
            base.hasChanged = false;
        }
        public override bool hasChange()
        {
            return base.hasChanged;
        }
    }
}

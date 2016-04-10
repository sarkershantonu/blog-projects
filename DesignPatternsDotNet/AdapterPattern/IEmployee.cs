using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AdapterPattern
{
    interface IEmployee
    {
        void AttenOffice();
        void JoinMeeting();
        void GetDailyReport();
    }
}

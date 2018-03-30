using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NPOI;
using NPOI.SS.UserModel;
using NPOI.XSSF.UserModel;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;

namespace Teaweoitingwekeke
{
    [TestFixture]
    class ExcelExercise
    {
        

        Page TestCase = new Page();

   
 

        [Test]
        public void UsersWithPasses()
        {
            XSSFWorkbook workbook;
            using (FileStream file = new
                FileStream(@"C:\\Users\\Admin\\Desktop\\Automated Testing\\Example.xlsx", FileMode.Open, FileAccess.Read))
            {

                workbook = new XSSFWorkbook(file);

            }

           

            ISheet sheet = workbook.GetSheet("Inputs");
            for (int row = 0; row <= sheet.LastRowNum; row++)
            {
                if (sheet.GetRow(row) != null) //null is when the row only conatins empty cells
                {
                   

                    string userName = sheet.GetRow(row).GetCell(3).StringCellValue;
                    string passWord = sheet.GetRow(row).GetCell(4).StringCellValue;
                    string expected = sheet.GetRow(row).GetCell(5).StringCellValue;
                    

                    TestCase.addNewUser(userName, passWord);
                    string status = TestCase.login(userName, passWord);

                    Assert.AreEqual(expected, status, "MESSED UP DAWG U CRAZY");




                }
            }

            
        }
    }


}


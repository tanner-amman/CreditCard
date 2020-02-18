		import java.io.File;

		import java.io.FileNotFoundException;

		import java.util.Scanner;
public class CreditCardValid
	{

		static int fileLength = 99;

		static int validNums = 0;

		static int invalidNums = 0;

					public static void main(String[] args)  

					{

						check();

					}

					public static void check() 

					{

						Scanner file = null;

						try {

							file = new Scanner(new File("Numbers.txt"));

						} catch (FileNotFoundException e) {

							// TODO Auto-generated catch block

							e.printStackTrace();

						}

						for (int i = 0; i < fileLength; i++)

						{

							long number = file.nextLong();

							int [] creditNumbers = new int [16];

							long size = (long) 1000000000000000.;

							

							for (int j = 0; j < 16; j++)

							{

								creditNumbers[j] = (int) (number / size);

								number = number - creditNumbers[j] * size;

								size = size / 10;

							}

							for (int a = 0; a < 16; a = a + 2)

							{

								creditNumbers[a] = creditNumbers[a] * 2;

								creditNumbers[a] = creditNumbers[a] % 10 + creditNumbers[a] / 10;

							}

							int total = 0;

							for (int g = 0; g < 16; g++)

							{

								total += creditNumbers[g];

							}

							validNums = 0;

							invalidNums = 0;

							if (total % 10 == 0)

							{

								validNums += 1;

							}

							else 

							{

								invalidNums += 1;

							}

						}

						System.out.println("There were " + validNums + " valid Numbers");

					}



				

			}

	

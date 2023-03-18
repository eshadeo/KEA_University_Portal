import java.util.*;


public class KEA {
                
     public static void main(String[] args) {

		syl_stack compfy = new syl_stack();
        compfy.insert("Linear Algebra and Univariate Calculus");
        compfy.insert("Basic Electrical and Electronics Engineering");
        compfy.insert("Chemistry");
        compfy.insert("Physics");
        compfy.insert("Engineering Graphics");
        compfy.insert("Multivariate Calculus");
        compfy.insert("Geo-Informatics");
        compfy.insert("Fundamentals of Programming Language - I");
        compfy.insert("Fundamentals of Programming Language - II");
        compfy.insert("Sustainable Engineering");
        
		syl_stack compsy = new syl_stack();
        compsy.insert("Discrete Mathematics");
        compsy.insert("Digital Systems and Computer Organisation");
        compsy.insert("Data Structures");
        compsy.insert("Programming Paradigms");
        compsy.insert("Universal Human Values");
        compsy.insert("Calculus and Statistics");
        compsy.insert("Theory of Computation");
        compsy.insert("DBMS");
        compsy.insert("Operating Systems");
        compsy.insert("Machine Learning");

		syl_stack compty = new syl_stack();
        compty.insert("Computer Networks");
        compty.insert("Design and Analysis of Algorithms");
        compty.insert("Software Design and Architecture");
        compty.insert("Program Elective - I");
        compty.insert("Program Elective - II");
        compty.insert("Open HS Elective I");
        compty.insert("Microprocessor and Microcontroller");
        compty.insert("Software Engineering");
        compty.insert("Cloud Computing");
        compty.insert("Professional and Societal Awareness for Engineers");
		compty.insert("Open HS Elective II");
		compty.insert("Program Elective - III");

		syl_stack compbt = new syl_stack();
        compbt.insert("Internship/Project");
        compbt.insert("Economics and Personal Finance");
        compbt.insert("Information Security");
        compbt.insert("Program Elective - IV");
        compbt.insert("Program Elective - V");
        compbt.insert("Open HS Elective III");
		compbt.insert("Open HS Elective IV");

		syl_stack itfy = new syl_stack();
        itfy.insert("Linear Algebra and Univariate Calculus");
        itfy.insert("Basic Electrical and Electronics Engineering");
        itfy.insert("Chemistry");
        itfy.insert("Physics");
        itfy.insert("Engineering Graphics");
        itfy.insert("Multivariate Calculus");
        itfy.insert("Geo-Informatics");
        itfy.insert("Fundamentals of Programming Language - I");
        itfy.insert("Fundamentals of Programming Language - II");
        itfy.insert("Sustainable Engineering");

		syl_stack itsy = new syl_stack();
        itsy.insert("Discrete Mathematics");
        itsy.insert("Digital Systems and Computer Organisation");
        itsy.insert("Data Structures");
        itsy.insert("Network Fundamentals");
        itsy.insert("Universal Human Values");
        itsy.insert("Calculus and Statistics");
        itsy.insert("Computer Network");
        itsy.insert("DBMS");
        itsy.insert("Operating Systems");
        itsy.insert("Human Computer Interaction");

		syl_stack itty = new syl_stack();
        itty.insert("Theory of Computation");
        itty.insert("Design and Analysis of Algorithms");
        itty.insert("Machine Learning");
        itty.insert("Program Elective - I");
        itty.insert("Program Elective - II");
        itty.insert("Open HS Elective I");
        itty.insert("Information Security");
        itty.insert("Object Oriented Software Engineering");
        itty.insert("Cloud Computing");
        itty.insert("Green Computing");
		itty.insert("Open HS Elective II");
		itty.insert("Program Elective - III");

		syl_stack itbt = new syl_stack();
        itbt.insert("Internship/Project");
        itbt.insert("Economics and Personal Finance");
        itbt.insert("Distributed Systems");
        itbt.insert("Program Elective - IV");
        itbt.insert("Program Elective - V");
        itbt.insert("Open HS Elective III");
		itbt.insert("Open HS Elective IV");
        

        syl_stack entcfy = new syl_stack();
        entcfy.insert("Linear Algebra and Univariate Calculus");
        entcfy.insert("Basic Electrical and Electronics Engineering");
        entcfy.insert("Chemistry");
        entcfy.insert("Physics");
        entcfy.insert("Engineering Graphics");
        entcfy.insert("Multivariate Calculus");
        entcfy.insert("Geo-Informatics");
        entcfy.insert("Fundamentals of Programming Language - I");
        entcfy.insert("Engineering Mechanics");
        entcfy.insert("Sustainable Engineering");

		syl_stack entcsy = new syl_stack();
        entcsy.insert("Calculus and Probability");
        entcsy.insert("Electronic Circuits and Applications");
        entcsy.insert("Signals and Systems");
        entcsy.insert("Data Structures and Algorithms");
        entcsy.insert("Universal Human Values");
        entcsy.insert("Digital Electronics");
        entcsy.insert("Analog and Digital Communication");
        entcsy.insert("Machine Learning with Python");
        entcsy.insert("Embedded Systems");
        entcsy.insert("Object Oriented Programming");

		syl_stack entcty = new syl_stack();
        entcty.insert("Digital Signal Processing");
        entcty.insert("VLSI Design");
        entcty.insert("Advanced Processors");
        entcty.insert("Program Elective - I");
        entcty.insert("Program Elective - II");
        entcty.insert("Open HS Elective I");
        entcty.insert("Wave Theory and Antenna");
        entcty.insert("Computer Networks and Security");
        entcty.insert("Control Systems");
        entcty.insert("Management for Engineers");
		entcty.insert("Open HS Elective II");
		entcty.insert("Program Elective - III");

		syl_stack entcbt = new syl_stack();
        entcbt.insert("Internship/Project");
        entcbt.insert("Economics and Personal Finance");
        entcbt.insert("Broadband Communication Systems");
        entcbt.insert("Program Elective - IV");
        entcbt.insert("Program Elective - V");
        entcbt.insert("Open HS Elective III");
		entcbt.insert("Open HS Elective IV");

		syl_stack admin_syllabus_stack = new syl_stack();
		admin_syllabus_stack.insert("2017-18");
		admin_syllabus_stack.insert("2018-19");
		admin_syllabus_stack.insert("2019-20");
		admin_syllabus_stack.insert("2020-21");
		admin_syllabus_stack.insert("2021-22");

		MyStack stc = new MyStack();
		stc.addstudymat("Previous Years Question Papers");
		stc.addstudymat("Textbooks/ Reference Books");
        stc.addstudymat("Teacher's PPTs");
		stc.addstudymat("Student Notes");
		
		MyQueue queue = new MyQueue();
		queue.addEvent("Hackathon");
		queue.addEvent("Coding");
		queue.addEvent("Cooking");
		queue.addEvent("Cultural Day");
		queue.addEvent("Engineer's Day");

		BST placement = new BST();
		Node3 root=null;
		root = placement.insert(root,"Google",5,37);
        root = placement.insert(root,"Microsoft",3,40);
        root = placement.insert(root,"Adobe",23,26);
        root = placement.insert(root,"Wipro",11,19);
		root = placement.insert(root,"Siemens",15,31);


        System.out.println("                                 -----Welcome to KEA University----- \n                                      Where dreams come true! \n\n Pick your role \n 1. Visitor \n 2. Admin ");
        Scanner sci = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
        int role = sci.nextInt();
		
        if (role == 1){
			System.out.println("You are on Viewing Mode. \n ");
			int ch = 0;
			do{
            System.out.println("****MENU**** \n 1. View Syllabus \n 2. View Study Material \n 3. Display Events \n 4. View Placement Record \n5. Exit");
			ch = sci.nextInt();
			switch(ch){
				case 1:
					int sch = 0;
					do{
						System.out.println("Stream: \n 1) Comp \n 2) IT \n 3) ENTC \n 4) Back");
						sch = sci.nextInt();
						switch(sch){
							
							case 1:
								int ych = 0;
								do{
								System.out.println("Year :\n 1) FY \n 2) SY \n 3) TY \n 4) B.Tech \n 5) Back");
								ych = sci.nextInt();
								switch(ych){
									case 1:
										compfy.display();
										break;
									case 2:
										compsy.display();
										break;
									case 3:
										compty.display();
										break;
									case 4 : 
										compbt.display();
										break;
								}							
							} while(ych != 5);
							break;

						    case 2:
							int yich = 0;
								do{
								System.out.println("Year :\n 1) FY \n 2) SY \n 3) TY \n 4) B.Tech \n 5) Back");
								yich = sci.nextInt();
								switch(yich){
									case 1:
										itfy.display();
										break;
									case 2:
										itsy.display();
										break;
									case 3:
										itty.display();
										break;
									case 4 : 
										itbt.display();
										break;
								}
								}while(yich !=5);
								break;

							case 3:
							int yech = 0;
							do{
								System.out.println("Year :\n 1) FY \n 2) SY \n 3) TY \n 4) B.Tech \n 5) Back");
								yech = sci.nextInt();
								switch(yech){
									case 1:
										entcfy.display();
										break;
									case 2:
										entcsy.display();
										break;
									case 3:
										entcty.display();
										break;
									case 4 : 
										entcbt.display();
										break;
								}
								}while(yech != 5);
							break;	
						}
						}while(sch != 4);

				case 2:
					stc.displaystudmat();
					break;
				
				case 3:
						queue.display();
						break;
				case 4:
						int bst = 0;
						do{
							System.out.println("Choose Action \n 1. Display Record \n 2. Search for a placement record \n 3. Back\n");
							bst = sci.nextInt();
							switch(bst){
								case 1:
									System.out.println(" Current Placement Info :");
									placement.inorder(root);
								break;
								case 2: 
									System.out.println("Company name to search for : ");
									String com = scs.nextLine();
									placement.search(root, com);


							}
						}while(bst != 3);
						
					}
			}while(ch != 5);
			}
		
		
        else if (role == 2){
            System.out.println("Enter password :");
            
            String password_entered = scs.nextLine();
        
            if (password_entered.equals("admin123")){
                System.out.println("Access Granted!\n ");
                int wish;
                do{
                    System.out.println("***MENU*** \n 1. Access Syllabus  \n 2. Access Study Material \n 3. Access Events \n 4. Access Placement Record \n 5. Exit");
                    System.out.println("Please enter your choice : ") ;
			        wish = sci.nextInt();
                    switch(wish){
                        case 1:
							int ach = 0;
							do{
                        	System.out.println("Choose Action : \n 1. View Current Syllabus \n 2. Add Syllabus \n 3. Remove Recent Syllabus \n 4. Back ");
							int sch = 0;
							ach = sci.nextInt();
							switch(ach){
								case 1:
								do{
									System.out.println("Stream: \n 1) Comp \n 2)IT \n 3) ENTC \n 4) Back");
									sch = sci.nextInt();
									switch(sch){
									case 1:
										int ych = 0;
										do{
										System.out.println("Year :\n 1) FY \n 2)SY \n 3)TY \n 4)B.Tech \n 5) Back");
										ych = sci.nextInt();
										switch(ych){
											case 1:
												compfy.display();
												break;
											case 2:
												compsy.display();
												break;
											case 3:
												compty.display();
												break;
											case 4 : 
												compbt.display();
												break;
										}
									
									}while(ych != 5);
									break;
									case 2:
									int yich = 0;
										do{
										System.out.println("Year :\n 1) FY \n 2)SY \n 3)TY \n 4)B.Tech \n 5) Back");
										yich = sci.nextInt();
										switch(yich){
											case 1:
												itfy.display();
												break;
											case 2:
												itsy.display();
												break;
											case 3:
												itty.display();
												break;
											case 4 : 
												itbt.display();
												break;
										}
										}while(yich !=5);
										break;
									case 3:
									int yech = 0;
									do{
										System.out.println("Year :\n 1) FY \n 2)SY \n 3)TY \n 4)B.Tech \n 5) Back");
										yech = sci.nextInt();
										switch(yech){
											case 1:
												entcfy.display();
												break;
											case 2:
												entcsy.display();
												break;
											case 3:
												entcty.display();
												break;
											case 4 : 
												entcbt.display();
												break;
										}
										}while(yech !=5);
										break;
									}	
									}while(sch != 4);
								case 2:
									System.out.println("Current Updated Syllabus: ");
									admin_syllabus_stack.display();
									System.out.println("Enter Year to add");
									String inp = scs.nextLine();
									admin_syllabus_stack.insert(inp);
									System.out.println("Updated Syllabus:");
									admin_syllabus_stack.display();
									break;

								case 3: 
									System.out.println("Current Updated Syllabus: ");
									admin_syllabus_stack.display();
									
									
									System.out.println("Removing Recent Syllabus, Updated Syllabus:");
									admin_syllabus_stack.pop();
									admin_syllabus_stack.display();
									break;

								}
								}while(ach !=4);
                    case 2: 
						int adstudmat = 0;
						do{
							System.out.println("Choose Action \n 1. Add Study Material \n 2. Remove Recent Study Material \n 3. Back");
							adstudmat = scs.nextInt();
							switch(adstudmat){
								case 1 :
									System.out.println("Current Materials:");
									stc.displaystudmat();
									System.out.println("How many materials do you want to add?");
									int no = sci.nextInt();
									while(no > 0){
									System.out.println("Enter Material Name: ");
									String a = scs.nextLine();
									stc.addstudymat(a);
									no--;
									}
									stc.displaystudmat();
									break;
								
								case 2:
								stc.studmatover();
								break;
							}

						}while(adstudmat !=3);
					case 3:
						int ev = 0;
						do{
							System.out.println(" Choose Action \n 1. Display Current Events \n 2. Add Event \n 3. Remove event\n 4. Show Upcoming event \n 5. Find number of current events\n 6. Back");
							ev = sci.nextInt();
							switch(ev){
								case 1:
								queue.display();
								break;
								case 2:
								System.out.println("Enter the number of events you want to add");
								int s = sci.nextInt();
								System.out.println("Add Events:");
								while (s>0)
								{
									String e = scs.next();
									queue.addEvent(e);
									s--;
								}
								break;
								case 3:
								System.out.println("Event removed : ");
								queue.doneevent();
								break;
								case 4:
								System.out.println("The upcoming event is : ");
								queue.recentevent();
								break;
								case 5:
								
									queue.getsize();
						}
					}while(ev != 6);
					case 4:
					int placeop = 0;
					do{
						System.out.println("Choose Action \n 1. Display Current Placement Record \n 2. Add Placement \n 3. Remove Placement \n 4. Update Placement info \n 5. Back ");
						placeop = sci.nextInt();
						switch(placeop){
							case 1 :
								placement.inorder(root);
								break;
							case 2:
								System.out.println("Number of placements to add : ");
								int r = sci.nextInt();
								while(r >0){
									System.out.println("Name of company : ");
									String c = scs.nextLine();
									System.out.println("Number of students placed : ");
									int stu = sci.nextInt();
									System.out.println("Salary(LPA)");
									int sal = sci.nextInt();
									placement.insert(root,c ,stu ,sal );
									r--;
								}
								System.out.println("Current Placement Record: ");
								placement.inorder(root);
								break;

							case 3:
								System.out.println("Enter company to be removed : ");
								String co = scs.nextLine();
								placement.delete(root,co );
								System.out.println("Updated List");
								break;

							case 4: 
								System.out.println("Enter Company to edit details : ");
								String up = scs.nextLine();
								placement.update(root, up);
								break;
							}
						}while (placeop != 5);
			}
                }while(wish != 5);
                
            }
            else{
                System.out.println("Access Denied.");
            }
        } 
        //scs.close();
    } 
}

class syl_stack{
	Node top;
	syl_stack()     
	{
		top=null;
	}

	class Node
	{     //node class with constructor
		String data;
		Node next;

		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}

	Node head=null;
	void insert(String data)    //method to insert elements into stack
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}

	void display()  //method to display stack
	{
		if(head==null)
		{
			System.out.println("no list");
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		System.out.println();
	}

	public void pop() {
		if (head == null) {
		   System.out.println("List is empty");
		} else {
		   head = head.next;
		}
	 }

	public boolean IsEmpty()   
	{
		if(top == null)
		{
			System.out.println("\n Stack is empty \n");
			return true;
		}
		else
		{
			return false;
		}
	}
	
}



class Node1 {
   String sm;
   Node1 next;

   Node1(String sm) {
      this.sm = sm;
      next = null;
   }

   public String getData() {
      return sm;
   }

   public void setData(String event) {
      this.sm = sm;
   }

   public Node1 getNext() {
      return next;
   }

   public void setNext(Node1 next) {
      this.next = next;
   }

   Node1 top = null;
}

class MyStack {
      Node1 top;

      MyStack() {
         top = null;
      }

      public void addstudymat(String newmat)
      {
         Node1 n = new Node1(newmat);
         if(top == null)
         {
            top = n;
         }
         else {
            n.setNext(top);
            top = n;
         }
      }

      public void studmatover() {
         if (top == null) {
            System.out.println("no study material present sorry");
         } else {
            System.out.println("Recent Material Added :"+ top.getData());
         }
      }

      public void displaystudmat() {
         Node1 curr = top;
         while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
         }
      }
}

class Node2
{
    String event;
    Node2 next;

    Node2(String event)
    {
        this.event = event;
        next = null;
    }
    public String getData()
    {
        return event;
    }
    public void setData(String event)
    {
        this.event = event;
    }
    public Node2 getNext()
    {
        return next;
    }
    public void setNext(Node2 next)
    {
        this.next = next;
    }
}

class MyQueue
{
    Node2 rear;
    Node2 front;
    int size;
    MyQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        boolean resp = false;
        if(size == 0)
        {
            resp = true;
        }
        return resp;
    }
    public void addEvent (String newevent)
    {
        Node2 n = new Node2(newevent);
        if(front == null)
        {
            rear = n;
            front = n;
            size ++;
        }
        else
        {
            rear.setNext(n);
            rear = n;
            size ++;
        }
    }
    public void doneevent ()
    {
        Node2 delevent = null;
        if(front != null)
        {
            if (front.getNext() != null)
            {
                delevent = new Node2 (front.getData());
                front = front.getNext();
                size --;
            }
            else
            {
                delevent = new Node2 (front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        System.out.println(delevent.getData());
    }
    public void recentevent ()
    {
        Node2 upevent = null;
        if (!isEmpty())
        {
            upevent = new Node2(front.getData());
        }
        System.out.println(upevent.getData());
    }
    public void getsize()
    {
        System.out.println("The number of events in queue : " +size);
    }
    public void display()
    {
        Node2 curr = front;
        if(front == null)
        {
            System.out.println("No Events this month");
        }
        else
        {
            System.out.println("The Events this month are: \n ");
            while (curr != null) {
                System.out.println(curr.getData());
                curr = curr.getNext();
            }
        }
    }
}



//aryas code

class Node3
{
   
    String company;           //name of the company
    int numPlaced;           //number of students placed in that company
    int salary;             //salary of the placed students
    Node3 left;
    Node3 right;
   
    Node3(String company,int numPlaced,int salary)
    {
        this.left=null;
        this.right=null;
        this.company=company;
        this.numPlaced=numPlaced;
        this.salary=salary;
    }
}
class BST
{
     Node3 insert(Node3 root,String c1,int n1,int sa1)
    {
        if(root==null)
        {
            root=new Node3(c1,n1,sa1);
            return root;
        }
        if(c1.compareToIgnoreCase(root.company)<0)
        {
            root.left=insert(root.left,c1,n1,sa1);
        }
        else if(c1.compareToIgnoreCase(root.company)>0)
        {
            root.right=insert(root.right,c1,n1,sa1);
        }
        return root;
    }
     Node3 delete(Node3 root,String c1)
    {
        if(c1.compareToIgnoreCase(root.company)<0)
        {
            root.left=delete(root.left,c1);
        }
        else if(c1.compareToIgnoreCase(root.company)>0)
        {
            root.right=delete(root.right,c1);
        }
        else
        {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
           
            Node3 is=inorderS(root.right);
            root.company=is.company;
            root.right=delete(root.right,is.company);
        }
        return root;
    }
   
     Node3 inorderS(Node3 root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
     void inorder(Node3 root)
    {
        if(root==null)
        {
            return ;
        }
       
        inorder(root.left);
        System.out.println("Company:"+root.company);
        System.out.println("Number of students placed:"+root.numPlaced);
        System.out.println("Salary (LPA):"+root.salary);
        System.out.println();
        inorder(root.right);
    }
     void search(Node3 root,String c1)
    {
        if(root==null)
        {
            return ;
        }
        int flag=0;
        Node3 temp=root;
        while(temp!=null)
        {
            if(c1.equals(root.company))
            {
                flag=1;
                break;
            }
            if(c1.compareToIgnoreCase(root.company)<0)
            {
                search(root.left,c1);
                break;
            }
            else if(c1.compareToIgnoreCase(root.company)>0)
            {
                search(root.right,c1);
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Details found of company:"+c1);
            System.out.println("Name:"+root.company);
            System.out.println("Number of students placed:"+root.numPlaced);
            System.out.println("Salary:"+root.salary);
            return;
           
        }
		}
    
      void update(Node3 root,String c1)
    {
        int newnum,newsal;
        if(root==null)
        {
            return ;
        }
        int flag=0;
        Node3 temp=root;
        while(temp!=null)
        {
            if(c1.equals(root.company))
            {
                flag=1;
                break;
            }
            if(c1.compareTo(root.company)<0)
            {
                update(root.left,c1);
                break;
            }
            else if(c1.compareTo(root.company)>0)
            {
                update(root.right,c1);
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("found the company "+c1);
            System.out.println("Enter the number of students placed:");
            Scanner s1=new Scanner(System.in);
            newnum=s1.nextInt();
            root.numPlaced=newnum;
            System.out.println("Enter the salary:");
            Scanner s2=new Scanner(System.in);
            newsal=s2.nextInt();
            root.salary=newsal;
            System.out.println("Updated successfully!");
            System.out.println("Company name:"+c1);
            System.out.println("Number of students placed:"+root.numPlaced);
            System.out.println("Salary:"+root.salary);
            return;
           
        }
    }
}

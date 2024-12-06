package com.karthik.core.datatypes;

public class Classes {
	
	 interface Anonymous{
		public String AnonymousClass();
	}

	public static void main(String[] args) {
	
		//Anonymous inner class is an example of interface
		
		Anonymous ac= new Anonymous() {

			@Override
			public String AnonymousClass() {
			
				return "AnonymousClass";
			}
			
		};
		
		System.out.println(ac.AnonymousClass());
	
		

	}
	
	public void localInnerClass() {
		class B{
			
			public void hello() {
				System.out.println (" local Inner Class --> in a method ");
			}
		}
		
	}
	
	
	class MemberInnerClass{
		public void hello() {
			System.out.println (" member inner class ");
		}
		
	}
	
	static class staticNestedClass{
		
		public void hello() {
			System.out.println (" static nested class " );
		}
	}
	
}


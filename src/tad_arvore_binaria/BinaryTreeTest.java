package tad_arvore_binaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void test() {
		LinkedBinaryTree<String> T = BuildExpression("((((3+1)*3)/((9-5)+2))-((3*(7-4))+6))");
		T.desenhaArvore(T, T.root(), 0, 0);
	}
	
	
	public LinkedBinaryTree<String> BuildExpression(String E){
		ArrayStack<LinkedBinaryTree<String>> S = new ArrayStack<LinkedBinaryTree<String>>();
		
		for (int i=0; i<E.length();i++){
			if(E.charAt(i)!=')' && E.charAt(i)!='(') {
				LinkedBinaryTree<String> T = new LinkedBinaryTree<String>();
				T.addRoot(Character.toString(E.charAt(i)));
				S.push(T);
			}
			else if(E.charAt(i)=='(') { 
				
			}
			else if(E.charAt(i)==')') {
				LinkedBinaryTree<String> T2 = new LinkedBinaryTree<String>();
				T2=S.pop();
				LinkedBinaryTree<String> T = new LinkedBinaryTree<String>();
				T=S.pop();
				LinkedBinaryTree<String> T1 = new LinkedBinaryTree<String>();
				T1=S.pop();
				T.attach(T.root(), T1, T2);
				S.push(T);


			}
			
		}
		return S.pop();
}

}

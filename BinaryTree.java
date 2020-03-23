
//https://www.moreofless.co.uk/binary-search-tree-bst-java/ codigo utilizado para la implementacion de binarytree
public class BinaryTree<E>
{
	private String llave;
    private Association<E,E> valor;
    private BinaryTree<E> izquierda, derecha;

    public BinaryTree( E key, E value ){
        this.valor = new Association<E,E>(key,value);
        this.llave =null;
    }

    public void put( E llave, E valor ){
        if ( this.valor.comparar(llave) < 0 ){
            if ( izquierda != null ){                 
                izquierda.put( llave, valor );             
            }             
            else{                 
            	izquierda = new BinaryTree<E>( llave, valor );             
            }         
        }         
        else if ( this.valor.comparar(llave) > 0 ){
            if ( derecha != null ){
                derecha.put( llave, valor );
            }
            else{
                derecha = new BinaryTree<E>( llave, valor );
            }
        }
        else{
            this.valor.setEspanol(valor);
        }
    }

    public E get( E key ){
        if ( this.valor.comparar(key) == 0){
            return this.valor.getEspanol();
        }
        if ( this.valor.comparar(key) < 0 ){
            return izquierda == null ? null : izquierda.get( key );
        }
        else{
            return derecha == null ? null : derecha.get( key );
        }
    }
 
    
	
	
}

package BehaviorPattern.ChainOfResponsibility;

public abstract class Middleware {
    private Middleware next;

    /**
     * Builds chains of middleware objects.
     * @param next
     * @return Middleware
     */
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     * @param email
     * @param password
     * @return boolean
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}

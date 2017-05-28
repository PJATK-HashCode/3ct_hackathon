package web;


/**
 * @author Lelental on 27.05.2017.
 */
/*
@WebServlet("/PlaceServlet")
public class PlaceServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private RepositoryService repositoryService = new RepositoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Place place = (Place) session.getAttribute("createTeam");
        Owner owner = (Owner) session.getAttribute("owner");
        List<Place> places = repositoryService.places().getAll("Place");

        if(places.isEmpty()){
            addPlace(place,owner,resp);
        }
        if(repositoryService.places().withName(place.getName())!=null){
            resp.getWriter().write("Podany plac juz jest zarejestrowany.");
        }
        else{
            addPlace(place,owner,resp);
        }
    }

    private void addPlace(Place place, Owner owner, HttpServletResponse resp) throws ServletException, IOException {
        repositoryService.owners().add(owner);
        repositoryService.places().add(place);
        resp.sendRedirect("/index.jsp");
    }
}
*/

package net.codejava.SpringBootWebAppExample.subpack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {
	@Autowired
	private GuestRepository guestRepo;

	@GetMapping("/create_guest")
	public String listAll(Model model) {

		Guests guest = new Guests();

		model.addAttribute("guests", guest);

		return "create_guest";

	}

	@RequestMapping(value = "/confirmation_page", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("guests") Guests reserve, Model model) {
		guestRepo.save(reserve);
		List<Guests> guest = guestRepo.findAll();
		model.addAttribute("guests", guest);

		return "confirmation_page";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") Long id, Model model) {
		ModelAndView mav = new ModelAndView("edit_guest");
		Guests guest = guestRepo.findById(id).get();

		model.addAttribute("guests", guest);

		return mav;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("guests") Guests reservation) {
		guestRepo.save(reservation);

		return "redirect:/";
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") Long id) {
		guestRepo.deleteById(id);
		return "redirect:/";
	}

	@GetMapping("/guest_table")
	public String listIt(Model model) {

		List<Guests> guest = guestRepo.findAll();
		model.addAttribute("guests", guest);
		return "guest_table";

	}
}

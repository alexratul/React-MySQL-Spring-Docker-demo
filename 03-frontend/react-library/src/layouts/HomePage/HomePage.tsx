
import { Carousel } from "./components/Carousel";
import { ExploreTopBooks } from "./components/ExploreTopsBooks";
import { Heros } from "./components/Heroes";
import { LibraryServices } from "./components/LibraryServices";


export const HomePage  = () => {
    return (
			<>
				<ExploreTopBooks></ExploreTopBooks>
				<Carousel></Carousel>
				<Heros></Heros>
				<LibraryServices></LibraryServices>
			</>
		);
}
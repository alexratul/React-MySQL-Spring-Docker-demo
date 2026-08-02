import React from "react";
import "./App.css";
import { HomePage } from "./layouts/HomePage/HomePage";
import { Footer } from "./layouts/NavbarAndFooter/Footer";
import { Navbar } from "./layouts/NavbarAndFooter/Navbar";
import { SearchBooksPage } from "./layouts/SearchBookPage/SearchBooksPage";
import { Route,Switch,Redirect } from "react-router-dom";

export const App = () => {
	return (
		<div className='d-flex flex-column min-vh-100'>
			<Navbar></Navbar>
			<div className='flex-grow-1'>
				<Switch>
					<Route path='/' exact>
						<Redirect to='/home' />
					</Route>
					<Route path='/home' exact>
						<HomePage></HomePage>
					</Route>
					<Route path='/search' exact>
						<SearchBooksPage></SearchBooksPage>
					</Route>
				</Switch>
			</div>
			<Footer></Footer>
		</div>
	);
};
